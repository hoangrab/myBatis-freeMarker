select * from sample
where 1 = 1
<#if id?? && id?has_content>
and id = ${id}
</#if>