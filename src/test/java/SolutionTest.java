import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void getResult1() throws IOException {
        assertEquals(10, Solution.getResult("STWSWTPPTPTTPWPP", "Human"));
        assertEquals(15, Solution.getResult("STWSWTPPTPTTPWPP", "Swamper"));
        assertEquals(12, Solution.getResult("STWSWTPPTPTTPWPP", "Woodman"));
    }

    @org.junit.jupiter.api.Test
    void getResult2() throws IOException {
        assertEquals(30, Solution.getResult("SSSSSSSSSSSSSSSS", "Human"));
        assertEquals(12, Solution.getResult("SSSSSSSSSSSSSSSS", "Swamper"));
        assertEquals(18, Solution.getResult("SSSSSSSSSSSSSSSS", "Woodman"));
    }

    @org.junit.jupiter.api.Test
    void getResult3() throws IOException {
        assertEquals(30, Solution.getResult("SSSSSSSSSSSSSSSS", "Human"));
        assertEquals(12, Solution.getResult("SSSSSSSSSSSSSSSS", "Swamper"));
        assertEquals(18, Solution.getResult("SSSSSSSSSSSSSSSS", "Woodman"));
    }
}