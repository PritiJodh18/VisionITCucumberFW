Feature: E-commerce Project Web Site Health Check

    @tag1
    Scenario: User is able to Open the browser, navigate to the URL and Search for Product
    Given User opened browser
    And User navigated to the home application url
    When User Search for product "Laptop"
    Then Search Result page is displayed

    @tag2
    Scenario: User is click on the Product and check the Product Details
    Given User opened browser
    And User navigated to the home application url
    And User Search for product "earphone"
    When User click on any product
    Then Product Description is displayed in new tab 