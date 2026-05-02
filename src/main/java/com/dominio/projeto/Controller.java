package com.dominio.projeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/request")
    public String helloWorld() {
        return "funcionou!";
    }

    @GetMapping("/requestWithParam/{param}")
    public String helloWithName(@PathVariable String param) {
        return "Hello, " + param + "!";
    }

    // When we use `@RequestParam String param`, we assume that the param will also
    // be
    // somenthing like
    // {{url}}/api/v1/responseWithEntity?param=value
    // if you want different name for the param, you can use `@RequestParam(name =
    // "id") String param`
    // or `@RequestParam String <other_name>`
    @GetMapping("/requestWithQueryParam")
    public String requestWithQueryParams(@RequestParam Map<String, String> param) {
        return "O parâmetro recebido foi: " + param.get("id");
    }

    // TODO: Implementar o Post com um campo simples
    @PostMapping("/requestWithPost")
    public String requestWithPost(@RequestBody String name) {
        return "Body recebido foi: " + name;
    }

    // TODO: Implementar o Post com varios campos
    @PostMapping("/requestWithListOfPost")
    public String requestWithListOfPost(@RequestBody Usuario user) {
        return "Body recebido foi: " + user.name() + " e " + user.email();
    }

    public record Usuario(String name, String email) {
    }

    // TODO: Implementar metodo com Header Params com retorno simples
    @PostMapping("/requestWithHeader")
    public String requestWithHeader(@RequestHeader String header) {
        return "Header recebido foi: " + header;
    }

    // TODO: Implementar metodo com Header Params com retorno com varios campos
    @PostMapping("/requestWithHeaderAndBody")
    public String requestWithHeaderAndBody(@RequestHeader Map<String, String> header) {
        return "Header recebido foi: " + header.get("name") + " e " + header.get("email");
    }

    // TODO: Implementar ResponseEntity
    @GetMapping("/responseWithEntity")
    public ResponseEntity<Object> getMethodName(@RequestParam() String enable) {
        if (!enable.equals("true")) {
            return ResponseEntity.badRequest().body("Parâmetro não liberado");
        }

        return ResponseEntity.ok().body("Liberado");
    }

}