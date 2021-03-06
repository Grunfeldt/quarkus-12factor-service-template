package com.v2com.iws10.axon.template.service.client;

import java.util.List;

public class Country {

    public String name;
    public String alpha2Code;
    public String capital;
    public List<Currency> currencies;

    public static class Currency {
        public String code;
        public String name;
        public String symbol;
    }

}
