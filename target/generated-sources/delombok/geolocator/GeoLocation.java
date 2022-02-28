// Generated by delombok at Mon Feb 28 20:58:12 CET 2022
package geolocator;

public class GeoLocation {
    private String as;
    private String city;
    private String country;
    private String countryCode;
    private String isp;
    private double lat;
    private double lon;
    private String org;
    private String query;
    private String region;
    private String regionName;
    private String timezone;
    private String zip;

    @java.lang.SuppressWarnings("all")
    public GeoLocation() {
    }

    @java.lang.SuppressWarnings("all")
    public String getAs() {
        return this.as;
    }

    @java.lang.SuppressWarnings("all")
    public String getCity() {
        return this.city;
    }

    @java.lang.SuppressWarnings("all")
    public String getCountry() {
        return this.country;
    }

    @java.lang.SuppressWarnings("all")
    public String getCountryCode() {
        return this.countryCode;
    }

    @java.lang.SuppressWarnings("all")
    public String getIsp() {
        return this.isp;
    }

    @java.lang.SuppressWarnings("all")
    public double getLat() {
        return this.lat;
    }

    @java.lang.SuppressWarnings("all")
    public double getLon() {
        return this.lon;
    }

    @java.lang.SuppressWarnings("all")
    public String getOrg() {
        return this.org;
    }

    @java.lang.SuppressWarnings("all")
    public String getQuery() {
        return this.query;
    }

    @java.lang.SuppressWarnings("all")
    public String getRegion() {
        return this.region;
    }

    @java.lang.SuppressWarnings("all")
    public String getRegionName() {
        return this.regionName;
    }

    @java.lang.SuppressWarnings("all")
    public String getTimezone() {
        return this.timezone;
    }

    @java.lang.SuppressWarnings("all")
    public String getZip() {
        return this.zip;
    }

    @java.lang.SuppressWarnings("all")
    public void setAs(final String as) {
        this.as = as;
    }

    @java.lang.SuppressWarnings("all")
    public void setCity(final String city) {
        this.city = city;
    }

    @java.lang.SuppressWarnings("all")
    public void setCountry(final String country) {
        this.country = country;
    }

    @java.lang.SuppressWarnings("all")
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    @java.lang.SuppressWarnings("all")
    public void setIsp(final String isp) {
        this.isp = isp;
    }

    @java.lang.SuppressWarnings("all")
    public void setLat(final double lat) {
        this.lat = lat;
    }

    @java.lang.SuppressWarnings("all")
    public void setLon(final double lon) {
        this.lon = lon;
    }

    @java.lang.SuppressWarnings("all")
    public void setOrg(final String org) {
        this.org = org;
    }

    @java.lang.SuppressWarnings("all")
    public void setQuery(final String query) {
        this.query = query;
    }

    @java.lang.SuppressWarnings("all")
    public void setRegion(final String region) {
        this.region = region;
    }

    @java.lang.SuppressWarnings("all")
    public void setRegionName(final String regionName) {
        this.regionName = regionName;
    }

    @java.lang.SuppressWarnings("all")
    public void setTimezone(final String timezone) {
        this.timezone = timezone;
    }

    @java.lang.SuppressWarnings("all")
    public void setZip(final String zip) {
        this.zip = zip;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GeoLocation)) return false;
        final GeoLocation other = (GeoLocation) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (java.lang.Double.compare(this.getLat(), other.getLat()) != 0) return false;
        if (java.lang.Double.compare(this.getLon(), other.getLon()) != 0) return false;
        final java.lang.Object this$as = this.getAs();
        final java.lang.Object other$as = other.getAs();
        if (this$as == null ? other$as != null : !this$as.equals(other$as)) return false;
        final java.lang.Object this$city = this.getCity();
        final java.lang.Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final java.lang.Object this$country = this.getCountry();
        final java.lang.Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final java.lang.Object this$countryCode = this.getCountryCode();
        final java.lang.Object other$countryCode = other.getCountryCode();
        if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode)) return false;
        final java.lang.Object this$isp = this.getIsp();
        final java.lang.Object other$isp = other.getIsp();
        if (this$isp == null ? other$isp != null : !this$isp.equals(other$isp)) return false;
        final java.lang.Object this$org = this.getOrg();
        final java.lang.Object other$org = other.getOrg();
        if (this$org == null ? other$org != null : !this$org.equals(other$org)) return false;
        final java.lang.Object this$query = this.getQuery();
        final java.lang.Object other$query = other.getQuery();
        if (this$query == null ? other$query != null : !this$query.equals(other$query)) return false;
        final java.lang.Object this$region = this.getRegion();
        final java.lang.Object other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false;
        final java.lang.Object this$regionName = this.getRegionName();
        final java.lang.Object other$regionName = other.getRegionName();
        if (this$regionName == null ? other$regionName != null : !this$regionName.equals(other$regionName)) return false;
        final java.lang.Object this$timezone = this.getTimezone();
        final java.lang.Object other$timezone = other.getTimezone();
        if (this$timezone == null ? other$timezone != null : !this$timezone.equals(other$timezone)) return false;
        final java.lang.Object this$zip = this.getZip();
        final java.lang.Object other$zip = other.getZip();
        if (this$zip == null ? other$zip != null : !this$zip.equals(other$zip)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GeoLocation;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $lat = java.lang.Double.doubleToLongBits(this.getLat());
        result = result * PRIME + (int) ($lat >>> 32 ^ $lat);
        final long $lon = java.lang.Double.doubleToLongBits(this.getLon());
        result = result * PRIME + (int) ($lon >>> 32 ^ $lon);
        final java.lang.Object $as = this.getAs();
        result = result * PRIME + ($as == null ? 43 : $as.hashCode());
        final java.lang.Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final java.lang.Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final java.lang.Object $countryCode = this.getCountryCode();
        result = result * PRIME + ($countryCode == null ? 43 : $countryCode.hashCode());
        final java.lang.Object $isp = this.getIsp();
        result = result * PRIME + ($isp == null ? 43 : $isp.hashCode());
        final java.lang.Object $org = this.getOrg();
        result = result * PRIME + ($org == null ? 43 : $org.hashCode());
        final java.lang.Object $query = this.getQuery();
        result = result * PRIME + ($query == null ? 43 : $query.hashCode());
        final java.lang.Object $region = this.getRegion();
        result = result * PRIME + ($region == null ? 43 : $region.hashCode());
        final java.lang.Object $regionName = this.getRegionName();
        result = result * PRIME + ($regionName == null ? 43 : $regionName.hashCode());
        final java.lang.Object $timezone = this.getTimezone();
        result = result * PRIME + ($timezone == null ? 43 : $timezone.hashCode());
        final java.lang.Object $zip = this.getZip();
        result = result * PRIME + ($zip == null ? 43 : $zip.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "GeoLocation(as=" + this.getAs() + ", city=" + this.getCity() + ", country=" + this.getCountry() + ", countryCode=" + this.getCountryCode() + ", isp=" + this.getIsp() + ", lat=" + this.getLat() + ", lon=" + this.getLon() + ", org=" + this.getOrg() + ", query=" + this.getQuery() + ", region=" + this.getRegion() + ", regionName=" + this.getRegionName() + ", timezone=" + this.getTimezone() + ", zip=" + this.getZip() + ")";
    }
}
