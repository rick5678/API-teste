package com.br.cubix.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cubix.api.dto.FinalizaReconferenciaDTO;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@RestController
@RequestMapping("/teste")
public class TesteResource {

    @GetMapping
    public String teste(@RequestBody FinalizaReconferenciaDTO finalizaReconferenciaDTO) {
        if(finalizaReconferenciaDTO.getCep() != null) {
        	String cep = finalizaReconferenciaDTO.getCep().replace("-", "");
        	try {
                HttpResponse<JsonNode> response = Unirest.get("https://viacep.com.br/ws/{cep}/json/")
                  .routeParam("cep", cep)
                  .asJson();

                System.out.println(response.getBody());
                return response.getBody().toString();
            } catch (UnirestException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
}
