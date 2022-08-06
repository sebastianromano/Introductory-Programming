Introductory Programming course (IT-University) - 2022

---

# Exercise: Ice Cream Shop

This exercise tests your ability to implement 
    ArrayLists
    and 
    for-each loops. 

The minions really love ice cream. 
So they have decided to open an icecream shop, 
but since they're IQ is lacklustre, 
you gotta help them keep track of their inventory. 
You do this by making a program... because why not?

1. Create a class called IceCreamShop.
    The class has two fields. 
        A 'String' shop name, 
        and 
        an 'ArrayList', 
            which takes 'String' to store the variants of ice cream in the shop.

2. The constructor takes a parameter, 
    the name of the shop and sets it in its body. 
Remember to also declare your 'ArrayList'!

3. Write a method getName 
    which just returns the name of the shop.

4. Write a method getVariants 
    which returns the list. 
    Hint: If a method normally looks like: 
    'public int getNumber'
        if you're returning an int, 
    then how does it look when you have to return an ArrayList?

5. Now add a method addFlavours 
    which takes a 'String' in the parameter. 
    This is the flavour you would like to add to your variants. 
    In the body of the method, 
    add the flavour to your list of variants, 
        but only if it's not already in the list!

6. You would also like to remove flavours from your variants, to write a method removeFlavours 
    which takes a 'String' flavour as a parameter. 
    This method should remove the given flavour from the list of variants, 
    but only if they are already in the list.

7. You want to know how many flavour variants you have, so 
    write a method 'amountOfVariants' that returns in 'int'. 
The method should return exactly the amount of variants that are stored in your list.

8. Finally create a method printFlavours 
    which returns nothing. 
You should start by printing: "[shop name] has [x] different flavours:", 
    where shop name is the name of the shop, 
    and x is the amount of different variants in your shop. 
The method should also print out every flavour variant from your list. 
Hint: You might want to loop here