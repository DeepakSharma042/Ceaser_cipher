# Ceaser_cipher

The Caesar Cipher technique is one of the earliest and simplest method of encryption technique. It’s simply a type of substitution cipher, i.e., each letter of a given text is replaced by a letter some fixed number of positions down the alphabet. For example with a shift of 1, A would be replaced by B, B would become C, and so on. The method is apparently named after Julius Caesar, who apparently used it to communicate with his officials.

Thus to cipher a given text we need an integer value, known as shift which indicates the number of position each letter of the text has been moved down.
The encryption can be represented using modular arithmetic by first transforming the letters into numbers, according to the scheme, A = 0, B = 1,…, Z = 25. Encryption of a letter by a shift n can be described mathematically as.

Algorithm : -

(0) Make a StringBuilder with message (encrypted)

(1) Write down the alphabet

(2) Compute the shifted alphabet

(3) Count from 0 to < length of encrypted, (call it i)

    (a) Look at the ith character of encrypted (call it currChar)
    
    (b) Find the index of currChar in the alphabet (call it idx)
    
    (c) If currChar is in the alphabet
        
        (i) Get the idxth character of shiftedAlphabet (newChar)
        
        (ii) Replace the ith character of encrypted with newChar
    
    (d) Otherwise: do nothing

(4) Your answer is the String inside of encrypted
