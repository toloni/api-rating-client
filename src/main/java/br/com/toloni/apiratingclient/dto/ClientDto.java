package br.com.toloni.apiratingclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDto {

    @JsonProperty("id_client")
    private Long idClient;

    @JsonProperty("first_name_client")
    private String firstNameClient;

    @JsonProperty("last_name_client")
    private String lastNameClient;

    @JsonProperty("email_client")
    private String emailClient;

    public ClientDto() {
    }

    public ClientDto(Long idClient, String firstNameClient, String lastNameClient, String emailClient) {
        this.idClient = idClient;
        this.firstNameClient = firstNameClient;
        this.lastNameClient = lastNameClient;
        this.emailClient = emailClient;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getFirstNameClient() {
        return firstNameClient;
    }

    public void setFirstNameClient(String firstNameClient) {
        this.firstNameClient = firstNameClient;
    }

    public String getLastNameClient() {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "idClient=" + idClient +
                ", firstNameClient='" + firstNameClient + '\'' +
                ", lastNameClient='" + lastNameClient + '\'' +
                ", emailClient='" + emailClient + '\'' +
                '}';
    }
}
