# GitHub Environments Setup

This document explains how to set up GitHub Environments for manual approval in the Android Debug Build workflow.

## Setting up the 'production' Environment

To enable manual approval for the debug APK build workflow, you need to create a 'production' environment in your GitHub repository:

1. Go to your repository on GitHub
2. Navigate to **Settings** > **Environments**
3. Click **New environment**
4. Name it: `production`
5. Configure the environment:
   - Check **Required reviewers**
   - Add yourself or other team members as reviewers
   - Optionally set **Wait timer** if you want a delay
   - Optionally restrict to **Protected branches** if needed

## Using Manual Approval

Once the environment is set up, you can trigger a build with manual approval:

1. Go to **Actions** tab in your repository
2. Select **Android Debug Build** workflow
3. Click **Run workflow**
4. Check the **Require manual approval before build** option
5. Click **Run workflow**

The workflow will pause at the approval step and wait for a reviewer to approve before proceeding with the build.

## Automatic Builds

For automatic builds (on push/PR), the approval step is skipped and the build runs immediately.