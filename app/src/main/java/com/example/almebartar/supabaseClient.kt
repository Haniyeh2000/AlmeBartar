package com.example.almebartar

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

val supabase = createSupabaseClient(
    supabaseUrl = "https://egzsfjxszpyjaniiblti.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImVnenNmanhzenB5amFuaWlibHRpIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzE2MDEyODksImV4cCI6MjA0NzE3NzI4OX0.-ZHSxUZKco1qcvlOw5glPsd-uL0O_udZT8ZQ4LIaPws"
) {
    install(Postgrest)
}