package com.rjwalker.plugins

import com.rjwalker.routes.customerRouting
import com.rjwalker.routes.getOrderRoute
import com.rjwalker.routes.listOrdersRoute
import com.rjwalker.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
