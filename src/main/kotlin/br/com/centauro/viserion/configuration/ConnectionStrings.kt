package br.com.centauro.viserion.configuration

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Value

@Component
public class ConnectionStrings {
    @Value("\${cs.mongodb}") lateinit var mongoDbConnectionString: String
}