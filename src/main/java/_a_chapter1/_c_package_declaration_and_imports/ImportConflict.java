package _a_chapter1._c_package_declaration_and_imports;
import java.util.*; //works
//OR
//import java.util.Date; //works

// DOES NOT COMPILE
/*import java.util.*;
import java.sql.*; */

//SOLUTION
/*import java.util.Date;
import java.sql.*; //remove this in order to work*/

// DOES NOT COMPILE
/*import java.util.Date;
import java.sql.Date;*/


public class ImportConflict {
    Date date;
    // some more code
    Date otherDate;
}
