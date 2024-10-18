package com.upiiz.proveedores.controllers;

import com.upiiz.proveedores.models.Proveedor;
import com.upiiz.proveedores.services.ProveedoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/proveedores")
public class ProveedoresController {
    ProveedoresService proveedoresService;

    public ProveedoresController(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    @GetMapping
    public ResponseEntity<List<Proveedor>> getProveedores() {
        return ResponseEntity.ok(proveedoresService.getProveedores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getProveedorId(@PathVariable Long id) {
        return  ResponseEntity.ok(proveedoresService.getProveedorId(id));
    }

    @PostMapping
    public ResponseEntity<Proveedor> postProveedor(@RequestBody Proveedor proveedor) {
        return ResponseEntity.ok(proveedoresService.postProveedor(proveedor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proveedor> putProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        proveedor.setId(id);
        return ResponseEntity.ok(proveedoresService.putProveedor(proveedor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProveedor(@PathVariable Long id) {
        proveedoresService.deleteProveedor(id);
        return ResponseEntity.noContent().build();
    }
}
