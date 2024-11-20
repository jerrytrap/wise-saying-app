package org.example;

import java.io.IOException;
import java.util.List;

public interface WiseService {
    int applyWise(String content, String author) throws IOException;

    Wise getWise(int id);

    List<Wise> getWises();

    List<Wise> getWises(String keywordType, String keyword);

    void editWise(int id, String newContent, String newAuthor) throws IOException;

    boolean deleteWise(int id);

    boolean buildWise();
}
