package com.example.notes

import androidx.lifecycle.LiveData

class NoteRepository(private val notedDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = notedDao.getAllNotes()
    suspend fun insert(note: Note){
        notedDao.insert(note)
    }
    suspend fun delete(note: Note){
        notedDao.delete(note)
    }
}

