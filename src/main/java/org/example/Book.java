package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book
{
        @Id
        private Integer id;
        private String book_name;

        public Integer getBook() {
            return  id;
        }

        public void setBook(Integer book) {
            this.id = id;
        }

        public String getBookName() {
            return book_name;
        }

        public void setBookName(String bookName) {
            this.book_name = bookName;
        }
    }


