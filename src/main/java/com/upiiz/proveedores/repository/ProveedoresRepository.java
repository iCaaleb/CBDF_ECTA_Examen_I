package com.upiiz.proveedores.repository;

import com.upiiz.proveedores.models.Proveedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProveedoresRepository {
    private final List<Proveedor> proveedores = new ArrayList<Proveedor>();
    private final AtomicLong id =new AtomicLong();

    public Proveedor postProveedor(Proveedor proveedor){
        proveedor.setId(id.incrementAndGet());
        proveedores.add(proveedor);
        return proveedor;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public Proveedor getProveedorId(Long id) {
        return proveedores.stream().filter(expense -> expense.getId().equals(id)).findFirst().orElse(null);
    }

    public Proveedor putProveedor(Proveedor proveedor){
        deleteProveedor(proveedor.getId());
        proveedores.add(proveedor);
        return proveedor;
    }

    public void deleteProveedor(Long id) {
        proveedores.removeIf(expense -> expense.getId().equals(id));
    }

}
