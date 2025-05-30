package org.sellary.sellary.shippedproduct.adapter.out.persistence.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import org.sellary.sellary.core.out.persistence.AuditEntity
import org.sellary.sellary.shippedproduct.application.domain.ShippedProductCost

@Entity
class ShippedProductCostEntity(
    val unitPurchasePrice: Double? = null,
    val boxPurchasePrice: Double? = null,
    val palletPurchasePrice: Double? = null,
    val unitSellingPrice: Double? = null,
    val boxSellingPrice: Double? = null,
    val palletSellingPrice: Double? = null,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipped_product_id")
    var shippedProduct: ShippedProductEntity? = null,
) : AuditEntity() {
    fun toDomain(): ShippedProductCost =
        ShippedProductCost(
            id = id,
            unitPurchasePrice = unitPurchasePrice,
            boxPurchasePrice = boxPurchasePrice,
            palletPurchasePrice = palletPurchasePrice,
            unitSellingPrice = unitSellingPrice,
            boxSellingPrice = boxSellingPrice,
            palletSellingPrice = palletSellingPrice,
        )

    companion object {
        fun fromDomain(domain: ShippedProductCost): ShippedProductCostEntity =
            ShippedProductCostEntity(
                unitPurchasePrice = domain.unitPurchasePrice,
                boxPurchasePrice = domain.boxPurchasePrice,
                palletPurchasePrice = domain.palletPurchasePrice,
                unitSellingPrice = domain.unitSellingPrice,
                boxSellingPrice = domain.boxSellingPrice,
                palletSellingPrice = domain.palletSellingPrice
            )
    }
}