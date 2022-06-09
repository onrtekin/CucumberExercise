Feature: US1004 jqueryscript search

  Scenario:TC11 jqeryscript sayfasinda istenen emojileri secme
    Given kullanici "jqueryscriptUrl" sayfasina gider
    Then emoji iframe girer
    Then ikinci emojinin ustunu tiklar
    And altta cikan butun emojileri secer
    And kullanici 3 sn bekler
    And kullanici ana iframe geri doner
    And kullanici formu doldurur
    And apply butonuna basar




