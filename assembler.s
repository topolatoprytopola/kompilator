.intel_syntax noprefix 
.global main
main:
push rbp
mov rbp, rsp
mov DWORD PTR [rbp-4],2
mov DWORD PTR [rbp-8],3
mov eax, DWORD PTR [rbp-4]
cmp eax, DWORD PTR [rbp-8]
jng .L2
sub DWORD PTR [rbp-8], 1 
.L2:
mov eax, DWORD PTR [rbp-8]
pop rbp
ret

