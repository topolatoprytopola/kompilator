.intel_syntax noprefix 
.global main
main:
push rbp
mov rbp, rsp
mov DWORD PTR [rbp-4],2
mov DWORD PTR [rbp-8],4
mov eax, DWORD PTR [rbp-8]
mov edx, DWORD PTR [rbp-4]
cdq 
idiv eax, edx
mov DWORD PTR [rbp-12], eax
mov eax, DWORD PTR [rbp-12]
pop rbp
ret

