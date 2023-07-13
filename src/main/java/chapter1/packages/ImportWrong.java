package chapter1.packages;

import java.nio.file.*; //works

//OR

/*import java.nio.file.Files; //works
import java.nio.file.Paths;*/ //works

//NON-WORKING Imports:

//import java.nio.*; // NO GOOD – a wildcard only matches class names, not "file.*Files"
//import java.nio.*.*; // NO GOOD – you can only have one wildcard, and it must be at the end
//import java.nio.files.Paths.*; // NO GOOD – you cannot import methods only class names
public class ImportWrong {
    public void read(Files files) {
        Paths.get("name");
    }
}
