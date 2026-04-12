package pnemonic.balloon_pop.view.navigation

enum class Routes(val route: String) {
    Home("/"),
    Board("/board"),
    Help("/help");

    override fun toString(): String {
        return route
    }
}