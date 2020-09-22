<?xml version="1.0"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
		<xsl:apply-templates />
	</xsl:template>

	<!-- To select all child of cd element and display them in output file -->
	<xsl:template match="cd/*">
		<xsl:element name="{local-name()}">							<!-- To get the tag name -->
			<xsl:value-of select="." />
		</xsl:element>
	</xsl:template>

	<!-- To display an error message and terminate the program if needed-->
	<xsl:template match="cd/error">
		<xsl:message terminate="no">
			Error: Sections can only be nested 2 deep.
		</xsl:message>
	</xsl:template>

	<!-- To select cd elements whereever they are in the file -->
	<!-- <xsl:template match="*/cd"> <xsl:element name="title"> <xsl:value-of 
		select="title" /> </xsl:element> <xsl:element name="artist"> <xsl:value-of 
		select="artist" /> </xsl:element> </xsl:template> -->

</xsl:stylesheet>
