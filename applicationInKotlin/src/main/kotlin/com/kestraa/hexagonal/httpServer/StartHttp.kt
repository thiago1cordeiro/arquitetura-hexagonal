package com.kestraa.hexagonal.httpServer

import com.fasterxml.jackson.databind.ObjectMapper
import com.kestraa.hexagonal.UserAdapter
import com.kestraa.hexagonal.factory.ApplicationFactory
import com.kestraa.hexagonal.model.User
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.post

class StartHttp {
    fun start() {
        val startRoutes = Javalin.create().start(8080)

        startRoutes.routes {
            get("/users") {
                it.json(ApplicationFactory.userController.getUsers())
            }
            post("/user") { ctx ->
                ctx.json(ApplicationFactory.userController.createUser(ctx.body<User>()))
            }
        }
    }
}
