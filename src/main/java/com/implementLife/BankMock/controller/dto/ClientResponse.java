package com.implementLife.BankMock.controller.dto;

import java.util.UUID;

public interface ClientResponse {
    UUID getId();

    String getFirstName();

    String getLastName();

    String getMiddleName();

    String getPhoneNumber();
}