# kotlin_for_java_developers
Kotlin Programing Learning course

# General considerations

- Concise: less verbose than Java
- Safe programming language
- Interoperable with Java
- 
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

### [Arrays](./src/academy/learnprogramming/datatypes/Arrays.kt)
> Collection of elements
> 
> When the array type is not informed, the compiler will infer the type
> 
> Arrays can be initialized with lambda expression
> 
> It is possible to mix data types in arrays
> 
> By using the primitive type array performance boost is generated
> 
> In order to interoperate with Java, primitive array must be passed as arguments
> 
> Primitive arrays allows to specify the size and all indexes will be initialized with the value zero

### [Null References](./src/academy/learnprogramming/null_references/NullReferences.kt)

> Null can not be the value of a non-null 
>
> If you want to sign a null value to a variable you have to explicit tell the compiler that with a question mark after the type of the variable
> 
> Kotlin enforces to do a Null check before using a nullable object interfaces
> 
> **Safe call operator / Safe access (?)**: 
>> - Whenever you are using a nullable variable, you must always use the question mark when refering to the variable
>> 
>> - If the variable is null, the expression will be evaluated to null
>> 
>> - If it is not null, the kotlin will evaluate the expression
> 
> **Elvis operator (?:)**: 
>> - Allows to assign a default value when an expression evaluates to null
> 
> > **Safe casting operator (as?)**:
>> - Allows to cast a variable and assigns null if is not possible to perform the casting
> 
> **Not Null Assetion**
>> Kotlin provides a way to tell the compiler that you are absolutily positive that the variable will not contain null
>? by following the expression with 2 exclamation marks (!!)
> 
> **Let function**
>> - Uses the object tha calls it as a parameter to the lambda and safe execute a block if the object is not null 
> 
> **Array of Nulls**
>> - Kotlin has a interface to create array of nulls as follow
>>```kotlin
>>val nullableInts = arrayOfNulls<Int?>(5)
>>```