Feature: Search by Product

  Scenario: Searching for a product on the Takealot Page adding onto Cart
    Given Sergey opens up the Takealot Homepage
    When he looks up "Apple iPhone 13 Pro Max 256GB - Alpine Green"
    And he adds the product onto the cart
    And he selects the mini cart checkout
    Then he should see information about "Apple iPhone 13 Pro Max 256GB - Alpine Green"

