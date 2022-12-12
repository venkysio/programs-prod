Errors in C++ are one of the newer types of attack. The actual attack mechanism is typi-
cally one of two variants on the same theme. 

The first is that a class may contain a function pointer.

The second attack leverages the fact that a C++ class with one or more virtual meth-
ods will contain a virtual function pointer table (vtable). If the contents of the class can be
overwritten, the pointer to the vtable can be altered, which leads directly to running the
code of the attacker’s choice.

Some of the common c++ errors and sins are:
Sinful Calls to Delete:
  In C++, you have two ways to allocate memory: new and new[] 
  The latter allocates an array of objects. When you need to free the memory, you need to match allocations withproper calls to delete or delete[].
  A less common problem is mismatching new with delete[].Unfortunately,the compiler may not even warn you about this mismatch.
  
 
