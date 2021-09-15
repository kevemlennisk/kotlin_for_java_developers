# kotlin_for_java_developers
Kotlin Programing Learning course

# General considerations


# Topics

### [Equality check](./src/academy/learnprogramming/equality/Equality.kt)
> You can use == to check structural equality and === to verify referential equality

### [Spelled operators](./src/academy/learnprogramming/spelled_operators/BitOperators.kt)
> Kotlin allow the use of spelled operators: 'and', 'or', 'xor'

### [Smart casting](./src/academy/learnprogramming/smart_casting/Casting.kt)
> After verifyng the instance of an variable, you can treat the variable as if it is already casted
> Under the wood, the compiler performs a casting operation for us

### [String templates](./src/academy/learnprogramming/string_template/StringTemplate.kt)
> $ sign allows the print the value of a variable inside a string text
> $ and curly braces '${}' together prints the avaluation of an expression. Ex: ${a+b}

### [Raw Strings](./src/academy/learnprogramming/raw_strings/RawStrings.kt)
> When you use triple quoted strings, you don't have o scape characters. It can contains line breaks
> but it cannot has tabs

### [Data Types](./src/academy/learnprogramming/datatypes/DataTypes.kt)

- There are no basic data type in Kotlin. Every variable is an object
- When not informed, the data type is inferred accordingdly with the data value
- Kotlin does not convert/cast variables automatically  
- Every data types has two functions that allows conversion to other data types
- Kotlin compiles objects to primitive types under the wood

>> - Int
>> - Long
>> - Double
>> - Short
>> - Byte
>> - String
>> - Float
>> - Char
>> - Boolean
>> - Any
>> - Nothing