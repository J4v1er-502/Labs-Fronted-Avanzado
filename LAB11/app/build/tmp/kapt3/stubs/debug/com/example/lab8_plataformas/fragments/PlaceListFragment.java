package com.example.lab8_plataformas.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0003J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0019\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0003J\b\u0010#\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/lab8_plataformas/fragments/PlaceListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/lab8_plataformas/adapters/PlaceAdapter$PlaceListener;", "()V", "data", "", "Lcom/example/lab8_plataformas/datasource/model/dataCharacters;", "database", "Lcom/example/lab8_plataformas/datasource/local/Database;", "placesList", "progressBar", "Landroid/widget/ProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "apiRequest", "", "checkData", "delete", "notifyDataChange", "onPlaceClicked", "position", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "saveKeyValue", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDataFromRoom", "setListeners", "setupRecycler", "app_debug"})
public final class PlaceListFragment extends androidx.fragment.app.Fragment implements com.example.lab8_plataformas.adapters.PlaceAdapter.PlaceListener {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private java.util.List<com.example.lab8_plataformas.datasource.model.dataCharacters> placesList;
    private java.util.List<com.example.lab8_plataformas.datasource.model.dataCharacters> data;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    private com.example.lab8_plataformas.datasource.local.Database database;
    private android.widget.ProgressBar progressBar;
    
    public PlaceListFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setDataFromRoom() {
    }
    
    private final void checkData() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void notifyDataChange() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void setListeners() {
    }
    
    private final void setupRecycler() {
    }
    
    @java.lang.Override()
    public void onPlaceClicked(@org.jetbrains.annotations.NotNull()
    com.example.lab8_plataformas.datasource.model.dataCharacters data, int position) {
    }
    
    private final void apiRequest() {
    }
    
    private final void delete() {
    }
    
    private final java.lang.Object saveKeyValue(java.lang.String key, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}