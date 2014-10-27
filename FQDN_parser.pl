#!usr/bin/perl
 
URLTEST:
{
print("Enter a full path URL: ");
$url = <STDIN>;
chomp($url);
 
if($url =~ m/(\S+)\:\/\/(\w+.\w+.\w+)\/(\w+.\S+)/)
{
print("Protocol: $1\n");
print("Domain: $2/\n");
print("Path: $3\n");
}
else
{
redo URLTEST
}
}
