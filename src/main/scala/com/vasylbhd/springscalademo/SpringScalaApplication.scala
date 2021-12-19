package com.vasylbhd.springscalademo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootAppRunner

object SpringScalaApplication extends App {
  SpringApplication.run(classOf[SpringBootAppRunner])
}
