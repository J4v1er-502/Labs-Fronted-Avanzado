package com.example.lab8_plataformas.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0002J\b\u0010\'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/example/lab8_plataformas/fragments/CharacterDetail;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/lab8_plataformas/fragments/CharacterDetailArgs;", "getArgs", "()Lcom/example/lab8_plataformas/fragments/CharacterDetailArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "buttonGuardar", "Landroid/widget/Button;", "characterEpisodeAppearances", "Landroid/widget/EditText;", "characterGender", "characterImage", "Landroid/widget/ImageView;", "characterName", "characterOrigin", "characterSpecies", "characterStatus", "database", "Lcom/example/lab8_plataformas/datasource/local/Database;", "resultadoLlamadaAPI", "Lcom/example/lab8_plataformas/datasource/model/OneCharacter;", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "user", "Lcom/example/lab8_plataformas/datasource/model/dataCharacters;", "apiRequest", "", "delete", "fetchUser", "getDataFromInputText", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "saveNewData", "setChanges", "setChangesFromApi", "setListeners", "setToolbar", "app_debug"})
public final class CharacterDetail extends androidx.fragment.app.Fragment {
    private android.widget.ImageView characterImage;
    private android.widget.EditText characterName;
    private android.widget.EditText characterSpecies;
    private android.widget.EditText characterStatus;
    private android.widget.EditText characterGender;
    private android.widget.EditText characterOrigin;
    private android.widget.EditText characterEpisodeAppearances;
    private com.google.android.material.appbar.MaterialToolbar toolbar;
    private com.example.lab8_plataformas.datasource.local.Database database;
    private com.example.lab8_plataformas.datasource.model.dataCharacters user;
    private com.example.lab8_plataformas.datasource.model.OneCharacter resultadoLlamadaAPI;
    private android.widget.Button buttonGuardar;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public CharacterDetail() {
        super();
    }
    
    private final com.example.lab8_plataformas.fragments.CharacterDetailArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setToolbar() {
    }
    
    private final void fetchUser() {
    }
    
    private final void setListeners() {
    }
    
    private final void saveNewData() {
    }
    
    private final void getDataFromInputText() {
    }
    
    private final void apiRequest() {
    }
    
    private final void delete() {
    }
    
    private final void setChanges() {
    }
    
    private final void setChangesFromApi() {
    }
}