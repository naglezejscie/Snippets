/*
Schematy http://www.jroller.com/VelkaVrana/entry/java_1_6_collections_class
Jeżeli element jest null to operacje sortowania wywalą NullPE

Class          Unikalność  NULLe Sort  opis
ArrayList      -            +     -
LinkedList     -            +     -  ArrayList + metody ineterface Queue (addFirst removeLast...)
HashSet        +            +     -  Nie zachowuje kolejnoscu, kolejne dodanie istniejącego elementu ignorowane, dobra do dużych zbiorów danych
LinkedHashSet  +            +     -  HashSet + zachowanie kolejności dodawanych elementów
TreeSet        +            -     +  HashSet posortowany
PriorityQueue  -            -     +  Posortowana rosnąco domyślnym komparatorem dla użytego typu danych lub przekazanym w konstruktorze. NIEDZIAŁA :/
ArrayDeque     -            -     -  LinkedList bez unikalności i NULLi
HashMap                           -  Nie gwarantuje kolejności
TreeMap                           +  Kolejność naturalna dla typu
LinkedHashMap                     +  Kolejność dodawania do mapy
*/
