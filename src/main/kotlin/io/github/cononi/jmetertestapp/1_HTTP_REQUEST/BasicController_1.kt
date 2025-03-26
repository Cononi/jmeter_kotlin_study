package io.github.cononi.jmetertestapp.`1_HTTP_REQUEST`

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/basic/v1")
class BasicController_1 {

    @GetMapping("/one")
    fun basicTest():String {
        return "Hello Jmeter"
    }
}