package com.example.lab8_plataformas.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/lab8_plataformas/adapters/PlaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/lab8_plataformas/adapters/PlaceAdapter$ViewHolder;", "dataSet", "", "Lcom/example/lab8_plataformas/datasource/model/dataCharacters;", "placeListener", "Lcom/example/lab8_plataformas/adapters/PlaceAdapter$PlaceListener;", "(Ljava/util/List;Lcom/example/lab8_plataformas/adapters/PlaceAdapter$PlaceListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PlaceListener", "ViewHolder", "app_debug"})
public final class PlaceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.lab8_plataformas.adapters.PlaceAdapter.ViewHolder> {
    private final java.util.List<com.example.lab8_plataformas.datasource.model.dataCharacters> dataSet = null;
    private final com.example.lab8_plataformas.adapters.PlaceAdapter.PlaceListener placeListener = null;
    
    public PlaceAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lab8_plataformas.datasource.model.dataCharacters> dataSet, @org.jetbrains.annotations.NotNull()
    com.example.lab8_plataformas.adapters.PlaceAdapter.PlaceListener placeListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.lab8_plataformas.adapters.PlaceAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.lab8_plataformas.adapters.PlaceAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/lab8_plataformas/adapters/PlaceAdapter$PlaceListener;", "", "onPlaceClicked", "", "data", "Lcom/example/lab8_plataformas/datasource/model/dataCharacters;", "position", "", "app_debug"})
    public static abstract interface PlaceListener {
        
        public abstract void onPlaceClicked(@org.jetbrains.annotations.NotNull()
        com.example.lab8_plataformas.datasource.model.dataCharacters data, int position);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/lab8_plataformas/adapters/PlaceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/example/lab8_plataformas/adapters/PlaceAdapter$PlaceListener;", "(Landroid/view/View;Lcom/example/lab8_plataformas/adapters/PlaceAdapter$PlaceListener;)V", "imageType", "Landroid/widget/ImageView;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "place", "Lcom/example/lab8_plataformas/datasource/model/dataCharacters;", "textName", "Landroid/widget/TextView;", "textRaceStatus", "setData", "", "setListeners", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.view.View view = null;
        private final com.example.lab8_plataformas.adapters.PlaceAdapter.PlaceListener listener = null;
        private final android.widget.ImageView imageType = null;
        private final android.widget.TextView textName = null;
        private final android.widget.TextView textRaceStatus = null;
        private final androidx.constraintlayout.widget.ConstraintLayout layout = null;
        private com.example.lab8_plataformas.datasource.model.dataCharacters place;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.example.lab8_plataformas.adapters.PlaceAdapter.PlaceListener listener) {
            super(null);
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.example.lab8_plataformas.datasource.model.dataCharacters place) {
        }
        
        private final void setListeners() {
        }
    }
}