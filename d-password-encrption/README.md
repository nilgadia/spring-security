encoding
  ASCII, BASE64, UNICODE
encryption
  Encrypt using secret key
symmetric same key use for both encrypt & decrypt
asymmetric public & private key     
    The private key must be kept secret & public key knows to anyone
Disadvantages can be decrypted if someone knows private key
TLS, VPN, SSH
Hashing
    `In hashing, data is converted to the hash using some hashing function, which can be any number generated from string or
    text Various hashing algorithms are MD 5 SHA 256 Data once hashed is non reversible`
    
    NoOpPasswordEncoder
    StandardPasswordEncoder
    Pbkdf2PasswordEncoder
    BCryptPasswordEncoder
    SCryptPasswordEncoder