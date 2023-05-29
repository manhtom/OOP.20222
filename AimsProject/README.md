## AIMS Project

The system needs to create a new cart for the user, where it will keep information on the DVDs that the user wants to buy. The user can add, remove DVDs from the cart as well as calculate the cost. The user can add maximum of 20 DVDs into one cart. The cart with its information and behaviors is modeled with the <i>Cart</i> class. When the user adds a DVD to the cart, the system must also create a new DVD based on the information that the user provides. This information can be displayed whenever the user
decides to see it. The DVD with its information and functions is modeled with the DVD class. Finally, the application needs an entry point for displaying to and taking input from the user (via a commandline interface), which will be the <i>Aims</i> class.

- [The <i>Aims</i> class which provides a main() method which interacts with the rest of the system](src/hust/soict/cybersec/aims/aims.java)
- [The <i>DigitalVideoDisc</i> class which stores the title, category, cost, director and length](src/hust/soict/cybersec/aims/disc/DigitalVideoDisc.java)
- [The <i>Cart</i> class to maintain the customer's cart (an array of DigitalVideoDisc objects)](src/hust/soict/cybersec/aims/cart/Cart.java)
- [The <i>Store</i> class to maintain a list of DVDs available in the store (an array of DigitalVideoDisc objects)](src/hust/soict/cybersec/aims/store/Store.java)
- [The <i>test</i> package which contains various test programs to try out the system's features](src/hust/soict/cybersec/test)
