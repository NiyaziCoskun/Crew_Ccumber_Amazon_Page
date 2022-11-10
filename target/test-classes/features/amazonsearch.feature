Feature: Amazon Search

    @amazonsearch
    Scenario: TC01_kullanici amazonda urun arar
        Given Kullanici amazon sayfasina gider
        And Kullanici aramakutusuna iphone yazar
        Then Kullanici sonucsayisini ekrana yazar