package level2.exercise7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MusicianTest {

    @Test
    public void testFindFavoriteSong_IsEmpty() {
        Musician musician = new Musician();

        Optional<String> favoriteSong = musician.findFavoriteSong();

        assertTrue(favoriteSong.isEmpty(), "Optional should be empty.");
    }

}
