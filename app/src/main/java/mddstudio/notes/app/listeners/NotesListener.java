package mddstudio.notes.app.listeners;

import mddstudio.notes.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
