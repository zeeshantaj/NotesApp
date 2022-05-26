package com.example.advance_notes_application;

import androidx.cardview.widget.CardView;

import com.example.advance_notes_application.models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
