package br.com.zupacademy.armando

import io.micronaut.grpc.server.GrpcEmbeddedServer
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class GrpcServerController(val grpcEmbeddedServer: GrpcEmbeddedServer) {
    @Get("/grpc/stop")
    fun stop(): HttpResponse<String> {
        grpcEmbeddedServer.stop()
        return HttpResponse.ok("grpc-server was stopped")
    }
}