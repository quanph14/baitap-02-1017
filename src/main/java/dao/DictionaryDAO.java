package dao;

import model.Word;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DictionaryDAO implements IDictionaryDAO {
        static List<Word> wordList = new ArrayList<>();

        static {
            wordList.add(new Word("friend", "bạn bè"));
            wordList.add(new Word("up", "lên"));
            wordList.add(new Word("down", "xuống"));
            wordList.add(new Word("run", "chạy"));

        }

        @Override
        public String searchVietnamese (String english){
            Iterator iterator = wordList.iterator();

            String vietnamese = "";
            while (iterator.hasNext()) {
                Word handler = (Word) iterator.next();
                if (handler.getEnglish().equals(english)) {
                    vietnamese = handler.getVietnamese();
                }
            }
            return vietnamese;
        }
    }
