package dto;


 public class InformeTransIva {
	 private String activityPeriod;
	 private String marketplace;
	 private String transactionEventId;
	 private String taxCalculationDate;
	 private String transactionDepartDate;
	 private String transactionCompleteDate;
	 private String sellerSku;
	 private String asin;
	 private String qty;
	 private String priceOfItemsAmtVatExcl;
	 private String promoPriceOfItemsAmtVatExcl;
	 private String totalPricceOfItemsAmtVatExcl;
	 private String shipChargeAmtVatExcl;
	 private String promoShipChargeAmtVatExcl;
	 private String totalShipChargeAmtVatExcl;
	 private String totalActivityValueAmtVatExcl;
	 private String priceOfItemsVatRatePercent;
	 private String priceOfItemsVatAmt;
	 private String promoPriceOfItemsVatAmt;
	 private String totalPriceOfItemsVatAmt;
	 private String shipChargeVatRatePercent;
	 private String shipChargeVatAmt;
	 private  String promoShipChargeVatAmt;
	 private  String totalShipChargeVatAmt;
	 private String totalActivityValueVatAmt;
	 private  String priceOfItemsAmtVatIncl;
	 private String promoPriceOfItemsAmtVatIncl;
	 private  String totalPriceOfItemsAmtVatIncl;
	 private  String shipChargeAmtVatIncl;
	 private  String promoShipChargeAmtVatIncl;
	 private  String totalShipChargeAmtVatIncl;
	 private  String totalActivityValueAmtVatIncl;
	 private  String saleArrivalCountry;
	 private  String invoiceUrl;

    public InformeTransIva(String activityPeriod, String marketplace, String transactionEventId, String taxCalculationDate, String transactionDepartDate, String transactionCompleteDate, String sellerSku, String asin,
                           String qty, String priceOfItemsAmtVatExcl, String promoPriceOfItemsAmtVatExcl, String totalPricceOfItemsAmtVatExcl, String shipChargeAmtVatExcl, String promoShipChargeAmtVatExcl, String totalShipChargeAmtVatExcl, String totalActivityValueAmtVatExcl,
                           String priceOfItemsVatRatePercent, String priceOfItemsVatAmt, String promoPriceOfItemsVatAmt, String totalPriceOfItemsVatAmt, String shipChargeVatRatePercent, String shipChargeVatAmt, String promoShipChargeVatAmt, String totalShipChargeVatAmt,
                           String totalActivityValueVatAmt, String priceOfItemsAmtVatIncl, String promoPriceOfItemsAmtVatIncl, String totalPriceOfItemsAmtVatIncl, String shipChargeAmtVatIncl, String promoShipChargeAmtVatIncl, String totalShipChargeAmtVatIncl,
                           String totalActivityValueAmtVatIncl, String saleArrivalCountry, String invoiceUrl) {
        this.activityPeriod = activityPeriod;
        this.marketplace = marketplace;
        this.transactionEventId = transactionEventId;
        this.taxCalculationDate = taxCalculationDate;
        this.transactionDepartDate = transactionDepartDate;
        this.transactionCompleteDate = transactionCompleteDate;
        this.sellerSku = sellerSku;
        this.asin = asin;
        this.qty = qty;
        this.priceOfItemsAmtVatExcl = priceOfItemsAmtVatExcl;
        this.promoPriceOfItemsAmtVatExcl = promoPriceOfItemsAmtVatExcl;
        this.totalPricceOfItemsAmtVatExcl = totalPricceOfItemsAmtVatExcl;
        this.shipChargeAmtVatExcl = shipChargeAmtVatExcl;
        this.promoShipChargeAmtVatExcl = promoShipChargeAmtVatExcl;
        this.totalShipChargeAmtVatExcl = totalShipChargeAmtVatExcl;
        this.totalActivityValueAmtVatExcl = totalActivityValueAmtVatExcl;
        this.priceOfItemsVatRatePercent = priceOfItemsVatRatePercent;
        this.priceOfItemsVatAmt = priceOfItemsVatAmt;
        this.promoPriceOfItemsVatAmt = promoPriceOfItemsVatAmt;
        this.totalPriceOfItemsVatAmt = totalPriceOfItemsVatAmt;
        this.shipChargeVatRatePercent = shipChargeVatRatePercent;
        this.shipChargeVatAmt = shipChargeVatAmt;
        this.promoShipChargeVatAmt = promoShipChargeVatAmt;
        this.totalShipChargeVatAmt = totalShipChargeVatAmt;
        this.totalActivityValueVatAmt = totalActivityValueVatAmt;
        this.priceOfItemsAmtVatIncl = priceOfItemsAmtVatIncl;
        this.promoPriceOfItemsAmtVatIncl = promoPriceOfItemsAmtVatIncl;
        this.totalPriceOfItemsAmtVatIncl = totalPriceOfItemsAmtVatIncl;
        this.shipChargeAmtVatIncl = shipChargeAmtVatIncl;
        this.promoShipChargeAmtVatIncl = promoShipChargeAmtVatIncl;
        this.totalShipChargeAmtVatIncl = totalShipChargeAmtVatIncl;
        this.totalActivityValueAmtVatIncl = totalActivityValueAmtVatIncl;
        this.saleArrivalCountry = saleArrivalCountry;
        this.invoiceUrl = invoiceUrl;
    }

	public String getActivityPeriod() {
		return activityPeriod;
	}

	public void setActivityPeriod(String activityPeriod) {
		this.activityPeriod = activityPeriod;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

	public String getTransactionEventId() {
		return transactionEventId;
	}

	public void setTransactionEventId(String transactionEventId) {
		this.transactionEventId = transactionEventId;
	}

	public String getTaxCalculationDate() {
		return taxCalculationDate;
	}

	public void setTaxCalculationDate(String taxCalculationDate) {
		this.taxCalculationDate = taxCalculationDate;
	}

	public String getTransactionDepartDate() {
		return transactionDepartDate;
	}

	public void setTransactionDepartDate(String transactionDepartDate) {
		this.transactionDepartDate = transactionDepartDate;
	}

	public String getTransactionCompleteDate() {
		return transactionCompleteDate;
	}

	public void setTransactionCompleteDate(String transactionCompleteDate) {
		this.transactionCompleteDate = transactionCompleteDate;
	}

	public String getSellerSku() {
		return sellerSku;
	}

	public void setSellerSku(String sellerSku) {
		this.sellerSku = sellerSku;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getPriceOfItemsAmtVatExcl() {
		return priceOfItemsAmtVatExcl;
	}

	public void setPriceOfItemsAmtVatExcl(String priceOfItemsAmtVatExcl) {
		this.priceOfItemsAmtVatExcl = priceOfItemsAmtVatExcl;
	}

	public String getPromoPriceOfItemsAmtVatExcl() {
		return promoPriceOfItemsAmtVatExcl;
	}

	public void setPromoPriceOfItemsAmtVatExcl(String promoPriceOfItemsAmtVatExcl) {
		this.promoPriceOfItemsAmtVatExcl = promoPriceOfItemsAmtVatExcl;
	}

	public String getTotalPricceOfItemsAmtVatExcl() {
		return totalPricceOfItemsAmtVatExcl;
	}

	public void setTotalPricceOfItemsAmtVatExcl(String totalPricceOfItemsAmtVatExcl) {
		this.totalPricceOfItemsAmtVatExcl = totalPricceOfItemsAmtVatExcl;
	}

	public String getShipChargeAmtVatExcl() {
		return shipChargeAmtVatExcl;
	}

	public void setShipChargeAmtVatExcl(String shipChargeAmtVatExcl) {
		this.shipChargeAmtVatExcl = shipChargeAmtVatExcl;
	}

	public String getPromoShipChargeAmtVatExcl() {
		return promoShipChargeAmtVatExcl;
	}

	public void setPromoShipChargeAmtVatExcl(String promoShipChargeAmtVatExcl) {
		this.promoShipChargeAmtVatExcl = promoShipChargeAmtVatExcl;
	}

	public String getTotalShipChargeAmtVatExcl() {
		return totalShipChargeAmtVatExcl;
	}

	public void setTotalShipChargeAmtVatExcl(String totalShipChargeAmtVatExcl) {
		this.totalShipChargeAmtVatExcl = totalShipChargeAmtVatExcl;
	}

	public String getTotalActivityValueAmtVatExcl() {
		return totalActivityValueAmtVatExcl;
	}

	public void setTotalActivityValueAmtVatExcl(String totalActivityValueAmtVatExcl) {
		this.totalActivityValueAmtVatExcl = totalActivityValueAmtVatExcl;
	}

	public String getPriceOfItemsVatRatePercent() {
		return priceOfItemsVatRatePercent;
	}

	public void setPriceOfItemsVatRatePercent(String priceOfItemsVatRatePercent) {
		this.priceOfItemsVatRatePercent = priceOfItemsVatRatePercent;
	}

	public String getPriceOfItemsVatAmt() {
		return priceOfItemsVatAmt;
	}

	public void setPriceOfItemsVatAmt(String priceOfItemsVatAmt) {
		this.priceOfItemsVatAmt = priceOfItemsVatAmt;
	}

	public String getPromoPriceOfItemsVatAmt() {
		return promoPriceOfItemsVatAmt;
	}

	public void setPromoPriceOfItemsVatAmt(String promoPriceOfItemsVatAmt) {
		this.promoPriceOfItemsVatAmt = promoPriceOfItemsVatAmt;
	}

	public String getTotalPriceOfItemsVatAmt() {
		return totalPriceOfItemsVatAmt;
	}

	public void setTotalPriceOfItemsVatAmt(String totalPriceOfItemsVatAmt) {
		this.totalPriceOfItemsVatAmt = totalPriceOfItemsVatAmt;
	}

	public String getShipChargeVatRatePercent() {
		return shipChargeVatRatePercent;
	}

	public void setShipChargeVatRatePercent(String shipChargeVatRatePercent) {
		this.shipChargeVatRatePercent = shipChargeVatRatePercent;
	}

	public String getShipChargeVatAmt() {
		return shipChargeVatAmt;
	}

	public void setShipChargeVatAmt(String shipChargeVatAmt) {
		this.shipChargeVatAmt = shipChargeVatAmt;
	}

	public String getPromoShipChargeVatAmt() {
		return promoShipChargeVatAmt;
	}

	public void setPromoShipChargeVatAmt(String promoShipChargeVatAmt) {
		this.promoShipChargeVatAmt = promoShipChargeVatAmt;
	}

	public String getTotalShipChargeVatAmt() {
		return totalShipChargeVatAmt;
	}

	public void setTotalShipChargeVatAmt(String totalShipChargeVatAmt) {
		this.totalShipChargeVatAmt = totalShipChargeVatAmt;
	}

	public String getTotalActivityValueVatAmt() {
		return totalActivityValueVatAmt;
	}

	public void setTotalActivityValueVatAmt(String totalActivityValueVatAmt) {
		this.totalActivityValueVatAmt = totalActivityValueVatAmt;
	}

	public String getPriceOfItemsAmtVatIncl() {
		return priceOfItemsAmtVatIncl;
	}

	public void setPriceOfItemsAmtVatIncl(String priceOfItemsAmtVatIncl) {
		this.priceOfItemsAmtVatIncl = priceOfItemsAmtVatIncl;
	}

	public String getPromoPriceOfItemsAmtVatIncl() {
		return promoPriceOfItemsAmtVatIncl;
	}

	public void setPromoPriceOfItemsAmtVatIncl(String promoPriceOfItemsAmtVatIncl) {
		this.promoPriceOfItemsAmtVatIncl = promoPriceOfItemsAmtVatIncl;
	}

	public String getTotalPriceOfItemsAmtVatIncl() {
		return totalPriceOfItemsAmtVatIncl;
	}

	public void setTotalPriceOfItemsAmtVatIncl(String totalPriceOfItemsAmtVatIncl) {
		this.totalPriceOfItemsAmtVatIncl = totalPriceOfItemsAmtVatIncl;
	}

	public String getShipChargeAmtVatIncl() {
		return shipChargeAmtVatIncl;
	}

	public void setShipChargeAmtVatIncl(String shipChargeAmtVatIncl) {
		this.shipChargeAmtVatIncl = shipChargeAmtVatIncl;
	}

	public String getPromoShipChargeAmtVatIncl() {
		return promoShipChargeAmtVatIncl;
	}

	public void setPromoShipChargeAmtVatIncl(String promoShipChargeAmtVatIncl) {
		this.promoShipChargeAmtVatIncl = promoShipChargeAmtVatIncl;
	}

	public String getTotalShipChargeAmtVatIncl() {
		return totalShipChargeAmtVatIncl;
	}

	public void setTotalShipChargeAmtVatIncl(String totalShipChargeAmtVatIncl) {
		this.totalShipChargeAmtVatIncl = totalShipChargeAmtVatIncl;
	}

	public String getTotalActivityValueAmtVatIncl() {
		return totalActivityValueAmtVatIncl;
	}

	public void setTotalActivityValueAmtVatIncl(String totalActivityValueAmtVatIncl) {
		this.totalActivityValueAmtVatIncl = totalActivityValueAmtVatIncl;
	}

	public String getSaleArrivalCountry() {
		return saleArrivalCountry;
	}

	public void setSaleArrivalCountry(String saleArrivalCountry) {
		this.saleArrivalCountry = saleArrivalCountry;
	}

	public String getInvoiceUrl() {
		return invoiceUrl;
	}

	public void setInvoiceUrl(String invoiceUrl) {
		this.invoiceUrl = invoiceUrl;
	}
}