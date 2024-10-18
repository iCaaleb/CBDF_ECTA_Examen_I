package com.upiiz.proveedores.services;

import com.upiiz.proveedores.models.Proveedor;
import com.upiiz.proveedores.repository.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresService {
    ProveedoresRepository proveedoresRepository;

    public ProveedoresService(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    public List<Proveedor> getProveedores() {
        return proveedoresRepository.getProveedores();
    }

    public Proveedor getProveedorId(Long id) {
        return proveedoresRepository.getProveedorId(id);
    }

    public Proveedor postProveedor(Proveedor proveedor) {
        return proveedoresRepository.postProveedor(proveedor);
    }

    public Proveedor putProveedor (Proveedor proveedor) {
        return proveedoresRepository.putProveedor(proveedor);
    }

    public void deleteProveedor (Long id) {
        proveedoresRepository.deleteProveedor(id);
    }
}
