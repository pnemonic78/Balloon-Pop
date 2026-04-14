package pnemonic.balloon_pop.view.board

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import pnemonic.balloon_pop.drawable.Flower
import pnemonic.balloon_pop.drawable.LifeHas
import pnemonic.balloon_pop.drawable.Trophy
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.BonusCallback
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.balloon_pop.view.theme.panel
import pnemonic.compose.Left
import pnemonic.balloon_pop.drawable.Bonus as BonusImage

private val sizeIcon = 30.dp
private val sizeBonus = 48.dp
private val thicknessProgress = 6.dp
private val colorProgressBar = Color(0xFFBFC654)
private val colorProgressTrack = Color(0xFF005703)
private val spacing = 8.dp

@Composable
fun BonusesView(modifier: Modifier = Modifier, bonuses: List<Bonus>, onClick: BonusCallback) {
    BonusesView(modifier = modifier, bonuses = bonuses, expanded = false, onClick = onClick)
}

@Composable
fun BonusesView(
    modifier: Modifier = Modifier,
    bonuses: List<Bonus>,
    expanded: Boolean,
    onClick: BonusCallback
) {
    if (bonuses.isEmpty()) return

    var expanded by remember { mutableStateOf(expanded) }
    val onBonusClick: BonusCallback = {
        onClick(it)
        expanded = false
    }

    Row(
        modifier = modifier.panel(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Left
    ) {
        Image(
            imageVector = BonusImage,
            contentDescription = "🎁",
            modifier = Modifier.size(sizeIcon)
                .clickable { expanded = !expanded }
        )
        AnimatedVisibility(
            visible = expanded,
            // Combines sliding and expanding horizontally
            enter = slideInHorizontally(
                initialOffsetX = { _ -> 0 } // Start from the left
            ) + expandHorizontally(
                expandFrom = Alignment.Start // Expand from the start (left)
            ) + fadeIn(),
            // Defines how it disappears
            exit = slideOutHorizontally(
                targetOffsetX = { _ -> 0 } // Exit to the left
            ) + shrinkHorizontally(
                shrinkTowards = Alignment.Start // Shrink towards the start (left)
            ) + fadeOut()
        ) {
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Left
            ) {
                for (bonus in bonuses) {
                    if (bonus.score <= 0) continue
                    Spacer(modifier = Modifier.width(spacing))
                    BonusSprite(bonus, onBonusClick)
                }
            }
        }
    }
}

@Composable
fun BonusSprite(bonus: Bonus, onClick: BonusCallback) {
    BonusSprite(bonus, sizeBonus, onClick)
}

@Composable
fun BonusSprite(bonus: Bonus, size: Dp, onClick: BonusCallback) {
    val progress = bonus.progress
    val total = bonus.score

    Box(
        modifier = Modifier
            .size(size)
            .clickable { onClick(bonus) },
        contentAlignment = Alignment.Center
    ) {
        when (bonus) {
            Bonus.None -> return
            is Bonus.Flower -> BonusFlower(bonus)
            is Bonus.Life -> BonusLife(bonus)
            is Bonus.Score -> BonusScore(bonus)
        }
        if (progress < total) {
            CircularProgressIndicator(
                modifier = Modifier.fillMaxSize().alpha(0.9f),
                progress = { progress.toFloat() / total.toFloat() },
                color = colorProgressBar,
                trackColor = colorProgressTrack,
                strokeWidth = thicknessProgress,
            )
        }
    }
}

@Composable
private fun BonusFlower(bonus: Bonus.Flower) {
    Image(
        modifier = Modifier.fillMaxSize(),
        imageVector = Flower,
        contentDescription = bonus.description,
        contentScale = ContentScale.Fit
    )
}

@Composable
private fun BonusLife(bonus: Bonus.Life) {
    Image(
        modifier = Modifier.fillMaxSize(),
        imageVector = LifeHas,
        contentDescription = bonus.description,
        contentScale = ContentScale.Fit
    )
}

@Composable
private fun BonusScore(bonus: Bonus.Score) {
    Image(
        modifier = Modifier.fillMaxSize(),
        imageVector = Trophy,
        contentDescription = bonus.description,
        contentScale = ContentScale.Fit
    )
}

@Composable
@Preview(widthDp = 700)
private fun Preview() {
    val items = listOf(
        Bonus.None,
        Bonus.Flower(progress = 20),
        Bonus.Life(progress = 40),
        Bonus.Score(progress = 60),
    )

    AppTheme {
        BonusesView(bonuses = items, expanded = true, onClick = {})
    }
}
