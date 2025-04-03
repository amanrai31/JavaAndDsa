## Permutation & Combination

- Permutation is the arrangement of objects in a specific order. Order matters in permutation

Suppose we have 3 people(A,B,C) & 3 seats

Seat 1 => A _ _ | B _ _ | C _ _;  (3 ppl can sit on seat 1, for *each* possibility we have 2 other possibility)

Seat 1 & 2 => A B _, A C _ | B A _, B C _ |  C A _ | C B _;

Seat 1, 2 & 3 => A B C, A C B | B A C, B C A | C A B, C B A; => Total 6 scenario.

Now we have 5 seats & 5 ppl => Total scenario = 5 * 4 * 3 * 2 * 1  i.e. = 5!

---

What if, we have 5 ppl but only 3 seats

_ _ _ => 5 _ _ => 5 * 4 _ => 5 * 4 * 3 = 60;

So, permutation for this case =>  ```math P(n, r) = n! / (n - r)!``` 
Here n = total no of items, r = selected items;

Question = Make 3 latter word from english alphabet (not necessarily different latter) = 26*26*26

If all letter are different => 26*25*24 ( 26!/(26-3)! )

**5 ppl 5 seats =>** Permutation = 5!/(5-5)! = 5!/0! => That is why 0! needs to be equal to 1.

**NOTE :** ``` 0! = 1 ```

---

COMBINATION => Combination is the selection of objects without considering order. Order does NOT matter in combinations.

Put 6 ppl on 3 seats => permutation will be 6!/(6-3)! = 120

But in combination => ABC, ACB, BAC, BCA, CAB, CBA => This is only one combination of 3 ppl. Similarly FBD, FDB, BDF, BFD, DBF, DFB is only one combination.

So, combination is => ```Permutation/combination of given entries.``` => 120/6

So, ```math C(n, r) = n! / [r! × (n - r)!]``` => 6!/((6-3)!*3!) = 20

---

Question2 => A,B,C,D have to shake hands. (Handshake happens b/w 2 ppl, obviously)

Permutation of this (total hand sake could be) => 4!/(4-2)!

Question3 => A card game has 36 unique cards(4suits), with card number 1to9 in each suit. A hand is collection of 4 cards which can be sorted however player choose. How many 9 card hand is possible?

Total number of permutation = 36!/(36-9)!. But this result includes same cards arranged in different sequence/order.

Unique hand will ignore this order, so unique hands = P(3,9)/9! => 36!/(36-9)!*(9!).

---

Probability & combination(Combinatorics)

- Toss 4 coins, what is propbability of getting exact 2 heads

(H/T), (H/T), (H/T), (H/T) => 2*2*2*2 = 16 scenario(total)

Exact 2 heads => HHTT, HTHT, HTTH || 



