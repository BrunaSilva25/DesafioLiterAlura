package br.com.bruna.literalura.service.api.dto;

import java.util.ArrayList;

public record BookGutendexResponse(Long count, ArrayList<BookData> results) {
}
