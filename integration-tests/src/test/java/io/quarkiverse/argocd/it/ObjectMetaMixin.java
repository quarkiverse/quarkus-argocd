package io.quarkiverse.argocd.it;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.fabric8.kubernetes.api.model.ManagedFieldsEntry;
import io.fabric8.kubernetes.api.model.ObjectMeta;

@SuppressWarnings("unused")
public abstract class ObjectMetaMixin extends ObjectMeta {

    @JsonIgnore
    private List<ManagedFieldsEntry> managedFields;

    @JsonIgnore
    public abstract List<ManagedFieldsEntry> getManagedFields();

}
