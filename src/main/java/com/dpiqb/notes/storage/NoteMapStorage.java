package com.dpiqb.notes.storage;

import com.dpiqb.notes.Note;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Map;

@Data
@Service
public class NoteMapStorage{
  private Map<Long, Note> storage;
}
